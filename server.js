const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');

const app = express();
const port = 3000;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, 'web')));

app.listen(port, () => {
  console.log(`Servidor escuchando en http://localhost:${port}`);
});
