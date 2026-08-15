const opSelect = document.getElementById('operation');
const input1 = document.getElementById('input1');
const input2 = document.getElementById('input2');
const btn = document.getElementById('calculate');
const resultEl = document.getElementById('result');

function formatNumber(n) {
  if (Number.isFinite(n)) {
    return (+n.toFixed(10)).toString(); // trim floating noise
  }
  return String(n);
}

function calculate() {
  const a = parseFloat(input1.value);
  const b = parseFloat(input2.value);
  const op = opSelect.value;

  if (isNaN(a) || isNaN(b)) {
    resultEl.textContent = 'Please enter valid numbers in both inputs.';
    resultEl.style.color = '#b91c1c';
    return;
  }

  let r;
  switch (op) {
    case 'add':
      r = a + b;
      break;
    case 'subtract':
      r = a - b;
      break;
    case 'multiply':
      r = a * b;
      break;
    case 'divide':
      if (b === 0) {
        resultEl.textContent = 'Error: division by zero.';
        resultEl.style.color = '#b91c1c';
        return;
      }
      r = a / b;
      break;
    case 'mod':
      if (b === 0) {
        resultEl.textContent = 'Error: modulo by zero.';
        resultEl.style.color = '#b91c1c';
        return;
      }
      r = a % b;
      break;
    default:
      resultEl.textContent = 'Unknown operation';
      resultEl.style.color = '#b91c1c';
      return;
  }

  resultEl.textContent = `Result: ${formatNumber(r)}`;
  resultEl.style.color = '#0b1223';
}

btn.addEventListener('click', calculate);

// allow pressing Enter in inputs to calculate
[input1, input2].forEach(i => i.addEventListener('keydown', (e) => {
  if (e.key === 'Enter') calculate();
}));
