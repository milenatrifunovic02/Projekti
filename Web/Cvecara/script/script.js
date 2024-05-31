//JS za pretragu

function pretraziProizvode() {
  var unos = document.getElementById('unos').value.toLowerCase();
  var proizvodi = document.querySelectorAll('.flowers .card');
  var red = document.getElementById('greskaRed');
  var greskaPoruka = document.getElementById('greskaPoruka');
  var anyMatching = false;

  proizvodi.forEach(function (proizvod) {
    var nazivProizvoda = proizvod.querySelector('.card-header').textContent.toLowerCase();

    if (nazivProizvoda.includes(unos)) {
      proizvod.style.display = 'block';
      greskaPoruka.style.display = 'none';
      red.style.visibility = 'hidden';
      anyMatching = true;
    } else {
      proizvod.style.display = 'none';
    }
  });

  if (!anyMatching && unos !== '') {
    greskaPoruka.style.display = 'block';
    red.style.visibility = 'visible';
  }
}

document.getElementById('unos').addEventListener('input', pretraziProizvode);

