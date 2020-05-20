const btn = document.querySelectorAll('.form-control');


let valueSex = null;
let valueAge = null;



function getSex(some) {

}


function someClick() {
    addEventListener('click', function (e) {
        let some = e.target;
        let someid = some.getAttribute("id");
        if (someid === 'age') {
            getAge(some);
        } else if (someid === 'sex') {
            getSex(some);
        }
    });

}

function getAge(some) {
    let someValue = some.getAttribute("value");
    let listAge = ["10대", "20대", "30대", "40대", "50대", "60대", "70대"];
    for (let i = 0; i < listAge.length; i++) {
        if (someValue === listAge[i]) {
            if (valueAge === null) {
                valueAge = some;
                setCssAge(valueAge);
            } else {

                setCssAge(valueAge);
                deleteCssAge(valueAge);
                valueAge = null;
            }
        }
    }
}

function getSex(some) {

    let someValue = some.getAttribute("value");
    let listSex = ["남성", "여성"];
    for (let i = 0; i < listSex.length; i++) {
        if (someValue === listSex[i]) {
            console.log(listSex[i]);
            if (valueSex === null) {
                valueSex = some;
                setCssSex(valueSex);
            } else {

                setCssSex(valueSex);
                deleteCssSex(valueSex);
                valueSex = null;
            }
        }
    }
}
// Setting Css for Value Age
function setCssAge(valueAge) {
    let valueAgeTag = valueAge.classList;
    console.log(valueAgeTag);
    valueAgeTag.remove('disableBtn');
    valueAgeTag.add("clickBtn");
};

function deleteCssAge(valueAge) {
    let valueAgeTag = valueAge.classList;
    valueAgeTag.remove("clickBtn");
    valueAgeTag.add("disableBtn");
};



// Setting Css for Value Sex
function setCssSex(valueSex) {
    console.log(valueSex);
    let valueSexTag = valueSex.classList;
    valueSexTag.remove('disableBtn');
    valueSexTag.add("clickBtn");
};

function deleteCssSex(valueSex) {
    let valueSexTag = valueSex.classList;
    valueSexTag.remove("clickBtn");
    valueSexTag.add("disableBtn");

}

function inifInfo() {
    someClick();

}
inifInfo();