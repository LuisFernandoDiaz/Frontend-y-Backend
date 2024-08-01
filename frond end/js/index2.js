const BASE_URL = "localhost:8080/";

const GetList = "listado";
//aqui estamos utilizando el link que genera en una busqueda


const GetListAJX = () => {
    $.ajax({
        type: `GET`,
        url: `${BASE_URL}${GetList}`,
        success: (data) => {
            console.log(data);
        },
        error: () => {
            alert('No hay comunicacion')
        }
    })
}

$(document).ready(function () {
    alert('ajx realmente an cargado')

    GetListAJX();
});