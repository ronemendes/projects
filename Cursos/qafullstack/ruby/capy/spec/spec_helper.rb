require 'capybara'
require 'capybara/rspec'
require 'selenium-webdriver'


RSpec.configure do |config|
  config.expect_with :rspec do |expectations|
    expectations.include_chain_clauses_in_custom_matcher_descriptions = true
  end

  config.mock_with :rspec do |mocks|   
    mocks.verify_partial_doubles = true
  end

  config.shared_context_metadata_behavior = :apply_to_host_groups

  config.include Capybara::DSL   #Para reconhecer o capybara. Integrado ao rspec

  config.before(:example) do 
    page.current_window.resize_to(1280, 800)
  end

  config.after(:example) do |e|
    nome = e.description.gsub(/[^A-Za-z0-9 ]/, '').tr('','_')  #expressão regular para tirar as letras com acentos /// tr é para substituir os espaços por underline
    page.save_screenshot('log/' + nome + '.png') if e.exception #salva o nome do arquivo se tiver erro (excessão)
  end

end

Capybara.configure do |config|
  config.default_driver = :selenium_chrome #_headless  #headless - execução por trás
  config.default_max_wait_time = 5  #Tempo limite para espera (Time-out)
  #config.app_host = ''
  config.app_host = 'https://training-wheels-protocol.herokuapp.com'
end
