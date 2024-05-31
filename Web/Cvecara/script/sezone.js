//JS za prikaz tabela ispod kartica kod godišnjih doba

var tabelaP = document.getElementById("prolecetable");
var tabelaL = document.getElementById("letotable");
var tabelaJ = document.getElementById("jesentable");
var tabelaZ = document.getElementById("zimatable");
var text = document.getElementById("textcvece");

function prikaziP(){
  text.style.display="block";
  tabelaP.style.display="block";
  tabelaL.style.display="none";
  tabelaJ.style.display="none";
  tabelaZ.style.display="none";
}
function prikaziL(){
  text.style.display="block";
  tabelaP.style.display="none";
  tabelaL.style.display="block";
  tabelaJ.style.display="none";
  tabelaZ.style.display="none";
}
function prikaziJ(){
  text.style.display="block";
  tabelaP.style.display="none";
  tabelaL.style.display="none";
  tabelaJ.style.display="block";
  tabelaZ.style.display="none";
}
function prikaziZ(){
  text.style.display="block";
  tabelaP.style.display="none";
  tabelaL.style.display="none";
  tabelaJ.style.display="none";
  tabelaZ.style.display="block";
}
