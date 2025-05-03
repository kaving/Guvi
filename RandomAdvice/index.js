
const getAdviceButton = document.getElementById("getAdvice");
const adviceText = document.getElementById("adviceText");

async function loadBreeds() {
  try {
    const res = await fetch("https://api.adviceslip.com/advice");
    const data = await res.json();
    const breeds = Object.keys(data.message);
    breeds.forEach((breed) => {
      const option = document.createElement("option");
      option.value = breed;
      option.textContent = breed.charAt(0).toUpperCase() + breed.slice(1);

      breedSelect.appendChild(option);
    });
  } catch (err) {}
}
async function getRandomAdvice() {
  const url = "";
  try {
    const res = await fetch("https://api.adviceslip.com/advice",{ cache: "no-cache" })
    const data = await res.json();
    const advice = data.slip.advice;
    console.log(advice);
    adviceText.innerText = advice;
  } catch (err) {
    console.error("Error fetching advice:", err);
    adviceText.innerText = "Failed to fetch advice. Please try again.";
  }
}
getAdviceButton.addEventListener("click", getRandomAdvice);