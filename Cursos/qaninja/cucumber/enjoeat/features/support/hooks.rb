
#redimensiona a janela
Before do
    page.current_window.resize_to(1440, 900)
end

#será executado antes de todos os steps
Before("@bread-bakery") do
    visit "/restaurants/bread-bakery/menu"
end