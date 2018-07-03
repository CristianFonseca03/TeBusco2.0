function validateNumber(e) {
    var key = window.Event ? e.which : e.keyCode
    return ((key >= 48 && key <= 57) || (key == 8))
}

function load() {
    var r = document.getElementById("output");
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "CargarPersonas", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            var dates = JSON.parse(xhr.responseText);
            var id = "";
            var nombre = "";
            var gender = "";
            var descripcion = "";
            var date_birthday = "";
            var date_disappeareance = "";
            var imgURL = "";
            var namePB = "";
            var phone_PB = "";
            var cedula_PB = "";
            for (var i in dates) {
                id = dates[i].id;
                nombre = dates[i].name;
                gender = dates[i].gender;
                descripcion = dates[i].description;
                imgURL = dates[i].img;
                namePB = dates[i].name_PB;
                phone_PB = dates[i].phone_PB;
                cedula_PB = dates[i].cedula_PB;
                date_birthday = dates[i].date_birthday;
                date_disappeareance = dates[i].date_disapperence;

                var article = document.createElement("article");
                article.setAttribute("class", "persona");

                var h5 = document.createElement("h5");
                h5.setAttribute("style", "font-weight: 600;");
                h5.setAttribute("class", "center");
                h5.appendChild(document.createTextNode(nombre));
                article.appendChild(h5);

                var img = document.createElement("img");
                img.setAttribute("src",imgURL);
                img.setAttribute("class", "left_img");
                article.appendChild(img);

                var h6_1 = document.createElement("h6");
                h6_1.setAttribute("class", "center_a");
                h6_1.appendChild(document.createTextNode("Genero : " + gender));
                article.appendChild(h6_1);

                var h6_2 = document.createElement("h6");
                h6_2.setAttribute("class", "center_a");
                h6_2.appendChild(document.createTextNode("Fecha de nacimiento : " + date_birthday));
                article.appendChild(h6_2);

                var h6_3 = document.createElement("h6");
                h6_3.setAttribute("class", "center_a");
                h6_3.appendChild(document.createTextNode("Visto por ultima vez : " + date_disappeareance));
                article.appendChild(h6_3);

                var a = document.createElement("a");
                a.setAttribute("class", "badge badge-info center button_des");
                a.setAttribute("data-toggle", "collapse");
                a.setAttribute("href", "#" + i);
                a.setAttribute("role", "button");
                a.setAttribute("aria-expanded", "false");
                a.setAttribute("aria-controls", i);
                a.appendChild(document.createTextNode("Descripción"));
                article.appendChild(a);

                var div_1 = document.createElement("div");
                div_1.setAttribute("class", "collapse");
                div_1.setAttribute("id", i);
                var div_2 = document.createElement("div");
                div_2.setAttribute("class","card card-body");
                var h7 = document.createElement("h7");
                h7.setAttribute("class", "center_a");
                h7.appendChild(document.createTextNode(descripcion));
                div_2.appendChild(h7);
                div_1.appendChild(div_2);
                article.appendChild(div_1);
                
                var a_2 = document.createElement("a");
                a_2.setAttribute("class", "badge badge-info center button_des");
                a_2.setAttribute("data-toggle", "collapse");
                a_2.setAttribute("href", "#datosPB" + i);
                a_2.setAttribute("role", "button");
                a_2.setAttribute("aria-expanded", "false");
                a_2.setAttribute("aria-controls", i);
                a_2.appendChild(document.createTextNode("Datos de la persona que lo busca"));
                article.appendChild(a_2);
                
                var div_3 = document.createElement("div");
                div_3.setAttribute("class", "collapse");
                div_3.setAttribute("id", "datosPB"+i);
                var div_4 = document.createElement("div");
                div_4.setAttribute("class","card card-body");
                var h7_2 = document.createElement("h7");
                h7_2.setAttribute("class", "center_a");
                h7_2.appendChild(document.createTextNode("Nombre: "+namePB));
                var h7_3 = document.createElement("h7");
                h7_3.setAttribute("class", "center_a");
                h7_3.appendChild(document.createTextNode("Cedula: "+cedula_PB));
                var h7_4 = document.createElement("h7");
                h7_4.setAttribute("class", "center_a");
                h7_4.appendChild(document.createTextNode("Telefono: "+phone_PB));
                div_4.appendChild(h7_2);
                div_4.appendChild(h7_3);
                div_4.appendChild(h7_4);
                div_3.appendChild(div_4);
                article.appendChild(div_3);
                
                r.appendChild(article);
            }
        }
    }
    xhr.send(null);
}