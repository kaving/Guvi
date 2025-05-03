const quizData = [
    {
      question: "WHat is 2+2?",
      options: ["3", "4", "1", "6"],
      answer: "4",
    },
    {
      question: "WHat is 2+2?",
      options: ["3", "4", "1", "6"],
      answer: "4",
    },
    {
      question: "WHat is 2+2?",
      options: ["3", "4", "1", "6"],
      answer: "4",
    },
  ];
  let currentQuestion = 0;
  let score = 0;
  const quizEl = document.getElementById("quiz");
  const nextBtn = document.getElementById("nextBtn");
  const scoreEl = document.getElementById("score");
  
  function loadQuestion() {
    const q = quizData[currentQuestion];
    quizEl.innerHTML = `<h2 class="text-lg-font-semibold">${q.question} </h2>
    ${q.options
      .map(
        (opt) => `
    <button class="option bg-gray-200 hover:bg-gray-300 w-full text-left px-4 py-2 rounded" data-answer="${opt}"> ${opt}</button>
    `
      )
      .join("")}
    `;
  
    document.querySelectorAll(".option").forEach((btn) => {
      btn.addEventListener("click", () => {
        const selected = btn.getAttribute("data-answer");
        if (selected === q.answer) {
          btn.classList.add("bg-green-300");
          score++;
        } else {
          btn.classList.add("bg-red-300");
        }
        document.querySelectorAll(".option").forEach((b) => (b.disabled = true));
      });
    });
  }
  nextBtn.addEventListener("click", () => {
    currentQuestion++;
    if (currentQuestion < quizData.length) {
      loadQuestion();
    } else {
      quizEl.innerHTML = "";
      nextBtn.style.display = "none";
      scoreEl.textContent = `You Scored ${score}`;
    }
  });
  loadQuestion();
  