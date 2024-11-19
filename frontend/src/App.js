import React, { useState } from 'react';
import ConfigForm from './components/ConfigForm';
import Quiz from './components/Quiz';

function App() {
  const [questions, setQuestions] = useState([]);

  const fetchQuestions = async (config) => {
    const response = await fetch(`/api/quiz/questions?level=${config.level}&framework=${config.framework}`);
    const data = await response.json();
    setQuestions(data);
  };

  return (
    <div>
      {!questions.length ? (
        <ConfigForm onSubmit={fetchQuestions} />
      ) : (
        <Quiz questions={questions} />
      )}
    </div>
  );
}

export default App;
