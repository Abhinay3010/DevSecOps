const express = require("express");
const app = express();

app.get("/payment", (req, res) => {
  res.send("Payment Service is UP");
});

app.listen(3000, () => {
  console.log("Payment service running on port 3000");
});
