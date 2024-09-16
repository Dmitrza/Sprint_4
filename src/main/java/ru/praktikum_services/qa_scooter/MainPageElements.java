package ru.praktikum_services.qa_scooter;

/*public class MainPageElements {

    //ГЛАВНАЯ СТРАНИЦА
    //кнопка Заказать вверху
    <button class="Button_Button__ra12g">Заказать</button>
            .//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']

    //кнопка Заказать внизу
    <button class="Button_Button__ra12g Button_Middle__1CSJM">Заказать</button>
            .//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']

    //СТРАНИЦА ЗАКАЗА-1
    //Поле Имя
    <input type="text" class="Input_Input__1iN_Z Input_Responsible__1jDKN" placeholder="* Имя" value="">
            .//input[@placeholder = '* Имя']

    //Поле Фамилия
    <input type="text" class="Input_Input__1iN_Z Input_Responsible__1jDKN" placeholder="* Фамилия" value="">
            .//input[@placeholder = '* Фамилия']

    //Поле Адрес
    <input type="text" class="Input_Input__1iN_Z Input_Responsible__1jDKN" placeholder="* Адрес: куда привезти заказ" value="">
            .//input[@placeholder = '* Адрес: куда привезти заказ']

    //Поле Станция метро
    <input tabindex="0" placeholder="* Станция метро" autocomplete="on" class="select-search__input" value="">
            .//input[@placeholder = '* Станция метро']

    //Поле телефон
    <input type="text" class="Input_Input__1iN_Z Input_Responsible__1jDKN" placeholder="* Телефон: на него позвонит курьер" value="">
            .//input[@placeholder = '* Телефон: на него позвонит курьер']

    //Кнопка Далее
    <button class="Button_Button__ra12g Button_Middle__1CSJM">Далее</button>
            .//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']

    //СТРАНИЦА ЗАКАЗА-2
    //Поле Когда привезти самокат
    <input type="text" placeholder="* Когда привезти самокат" class="Input_Input__1iN_Z Input_Responsible__1jDKN" value="">
            .//input[@placeholder = '* Когда привезти самокат']

    //Поле Срок аренды
    <div class="Dropdown-control" aria-haspopup="listbox"><div class="Dropdown-placeholder">* Срок аренды</div><div class="Dropdown-arrow-wrapper"><span class="Dropdown-arrow"></span></div></div>
            .//div[@class = 'Dropdown-root']

    //Выпадающий список
    <div class="Dropdown-menu" aria-expanded="true"><div class="Dropdown-option" role="option" aria-selected="false">сутки</div><div class="Dropdown-option" role="option" aria-selected="false">двое суток</div><div class="Dropdown-option" role="option" aria-selected="false">трое суток</div><div class="Dropdown-option" role="option" aria-selected="false">четверо суток</div><div class="Dropdown-option" role="option" aria-selected="false">пятеро суток</div><div class="Dropdown-option" role="option" aria-selected="false">шестеро суток</div><div class="Dropdown-option" role="option" aria-selected="false">семеро суток</div></div>

    //Опция сутки из списка
    <div class="Dropdown-option" role="option" aria-selected="false">сутки</div>
            .//div[text() = 'сутки']

    //Опция пять суток
    <div class="Dropdown-option" role="option" aria-selected="false">пятеро суток</div>
            .//div[text() = 'пять суток']

    //Поле Цвет самоката
    <div class="Order_Checkboxes__3lWSI"><div class="Order_Title__3EKne">Цвет самоката</div><label for="black" class="Checkbox_Label__3wxSf"><input id="black" class="Checkbox_Input__14A2w" type="checkbox" name="">чёрный жемчуг</label><br><label for="grey" class="Checkbox_Label__3wxSf"><input id="grey" class="Checkbox_Input__14A2w" type="checkbox" name="">серая безысходность</label></div>
            .//div[@class='Order_Checkboxes__3lWSI']
    //Опция черный
    <label for="black" class="Checkbox_Label__3wxSf"><input id="black" class="Checkbox_Input__14A2w" type="checkbox" name="">чёрный жемчуг</label>
            By.id('black')
    //Опция серая
    <label for="grey" class="Checkbox_Label__3wxSf"><input id="grey" class="Checkbox_Input__14A2w" type="checkbox" name="">серая безысходность</label>
            By.id('grey')

    //Поле Комментарий
    <label for="grey" class="Checkbox_Label__3wxSf"><input id="grey" class="Checkbox_Input__14A2w" type="checkbox" name="">серая безысходность</label>
            .//input[placeholder="Комментарий для курьера"]

    //Кнопка Заказать
    <button class="Button_Button__ra12g Button_Middle__1CSJM">Заказать</button>
            .//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']

    //Кнопка "Да" попапа Хотите оформить заказ
    <button class="Button_Button__ra12g Button_Middle__1CSJM">Да</button>
            .//button[text()='Да']




    //Заголовок списка "Вопросы о важном"
    <div class="Home_SubHeader__zwi_E">Вопросы о важном</div>
            .//div[text()='Вопросы о важном']
    //1-ый элемент списка Сколько это
    <div id="accordion__heading-0" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-0" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Сколько это стоит? И как оплатить?</div>
            By.id('accordion__heading-0')
    //текст внутри 1-го элемента
    <p>Сутки — 400 рублей. Оплата курьеру — наличными или картой.</p>

    //2-ой элемент списка Хочу сразу
    <div id="accordion__heading-1" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-1" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Хочу сразу несколько самокатов! Так можно?</div>
            By.id('accordion__heading-1')
    //текст внутри 2-го элеменета
    <p>Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.</p>

    //3-ий элемент списка Как рассчитывается
    <div id="accordion__heading-2" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-2" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Как рассчитывается время аренды?</div>
            By.id('accordion__heading-2')

    //текст внутри 3-го элемента
    <p>Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.</p>

    //4-ый элемент списка Можно ли заказать
    <div id="accordion__heading-3" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-3" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Можно ли заказать самокат прямо на сегодня?</div>
            By.id('accordion__heading-3')

    //текст внутри 4-го элемента
    <p>Только начиная с завтрашнего дня. Но скоро станем расторопнее.</p>

    //5-ый элемент списка Можно ли продлить
    <div id="accordion__heading-4" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-4" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Можно ли продлить заказ или вернуть самокат раньше?</div>
            By.id('accordion__heading-4')

    //текст внутри 5-го элемента
    <p>Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.</p>

    //6-ой элемент списка Вы привозите
    <div id="accordion__heading-5" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-5" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Вы привозите зарядку вместе с самокатом?</div>
            By.id('accordion__heading-5')

    //текст внутри 6-го элемента
    <p>Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.</p>

    //7-ой элемент списка Можно ли отменить
    <div id="accordion__heading-6" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-6" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Можно ли отменить заказ?</div>
            By.id('accordion__heading-6')

    //текст внутри 7-го элемента
    <p>Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.</p>

    //8-ой элемент списка Я живу за
    <div id="accordion__heading-7" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-7" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Я жизу за МКАДом, привезёте?</div>
            By.id('accordion__heading-7')

    //текст внутри 8-го элемента
    <p>Да, обязательно. Всем самокатов! И Москве, и Московской области.</p>
}
