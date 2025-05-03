const dogImage = document.getElementById('dogImage');
const fetchDogButton = document.getElementById('fetchDogButton');

async function fetchRandomDog() {
    try {
        const response = await fetch('https://dog.ceo/api/breeds/image/random');
        const data = await response.json();
        dogImage.src = data.message;
    } catch (error) {
        console.error('Error fetching random dog image:', error);
    }
}

fetchDogButton.addEventListener('click', fetchRandomDog);