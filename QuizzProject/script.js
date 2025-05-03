const questions = [
    {
        question: "What is the capital of France?",
        options: ["Berlin", "Madrid", "Paris", "Rome"],
        answer: "Paris"
    },
    {
        question: "Which planet is known as the Red Planet?",
        options: ["Earth", "Mars", "Jupiter", "Venus"],
        answer: "Mars"
    },
    {
        question: "Who wrote 'Hamlet'?",
        options: ["Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen"],
        answer: "William Shakespeare"
    }
];

let currentQuestionIndex = 0;

function loadQuestion() {
    const questionElement = document.getElementById('question-text');
    const optionsList = document.getElementById('options-list');
    const currentQuestion = questions[currentQuestionIndex];

    questionElement.textContent = currentQuestion.question;
    optionsList.innerHTML = '';

    currentQuestion.options.forEach(option => {
        const li = document.createElement('li');
        li.textContent = option;
        li.addEventListener('click', () => {
            if (option === currentQuestion.answer) {
                alert('Correct!');
            } else {
                alert('Wrong!');
            }
        });
        optionsList.appendChild(li);
    });
}

document.getElementById('next-button').addEventListener('click', () => {
    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
        loadQuestion();
    } else {
        alert('Quiz Completed!');
        currentQuestionIndex = 0;
        loadQuestion();
    }
});

loadQuestion();