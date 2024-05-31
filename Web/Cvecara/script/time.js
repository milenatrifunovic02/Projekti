//JS za prikz vremena u footer-u

function updateDateTime() {
    const now = new Date();
  
    const currentDateTime = now.toLocaleString();
  
    document.querySelector('#datum').textContent = currentDateTime;
  }
  
  setInterval(updateDateTime, 1000);