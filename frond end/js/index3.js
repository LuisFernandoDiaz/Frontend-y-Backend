
let booton = document.getElementById("btnRegistrar");

booton.addEventListener("click", evento => {
    registrarPelicula();
})


let registrarPelicula = async () => {

    let campos = {};


    campos.nombre = document.getElementById("nombre").value;
    campos.dni = document.getElementById("dni").value;
    campos.genero = document.getElementById("genero").value;


    const peticion = await fetch("http://localhost:8080/guardar",
        {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)
        });


}