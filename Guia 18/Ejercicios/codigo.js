document.addEventListener("DOMContentLoaded", function () {
  const contenedor = document.getElementById("container");
  let ej = 25;
  for (let i = 0; i < ej; i++) {
    contenedor.innerHTML += ` <a href="ejercicios/ej${i+1}.html"><div class="item">Ejercicio ${i+1}</div></a> `;
  }
});
