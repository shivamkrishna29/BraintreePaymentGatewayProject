<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Payment</title>
  <link rel="stylesheet" href="assets/css/braintree-ui.css">
  <script src="https://js.braintreegateway.com/web/dropin/1.42.0/js/dropin.js"></script>
</head>
<body>
<div id="dropin-container"></div>
<button id="submit-button" class="button button--small button--green">Pay Now</button>
<script type="text/javascript">
var button = document.querySelector('#submit-button');
console.log('button works--->');
braintree.dropin.create({
  authorization: 'sandbox_g42y39zw_348pk9cgf3bgyw2b',
  selector: '#dropin-container'
}, function (err, instance) {
  button.addEventListener('click', function () {
    instance.requestPaymentMethod(function (err, payload) {
      // Submit payload.nonce to your server
    });
  })
});
</script>
</body>
</html>