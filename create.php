








<!DOCTYPE html>
<html>
<head>
<style>

body {font-family: Arial, Helvetica, sans-serif;}
form {display:;}
/* Full-width input fields */
input[type=text], input[type=datetime-local] {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  align-items: center;
}

/* Set a style for all buttons */
button {
  background-color: green;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: auto;
}

button:hover {
  opacity: 0.8;
}

/* Extra styles for the cancel button */
h1 {text-align: center;}
/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}

img.avatar {
  width: 20%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
<html>
<body>

<h2>OZAttend</h2>
 <div class="imgcontainer">
     
      <img src="attend.PNG" alt="Avatar" class="avatar">
    </div>

<form action="page2.html">
 <b>Enter Building:</b><br>
  <input type="text" placeholder="Building Name"  required>
  <br>
  <b>Enter Room Number:</b><br>
  <input type="text" placeholder="Enter Room Number" name="Room Number" required>
  <br>
  <b>Pick Date And Time:</b><br>
  <input type="datetime-local" placeholder="Pick Date And Time" name="bdaytime" required>
  <br>
      <b>CoOrganizer Email</b>
      </br>
    </label>
    <input type="text" placeholder="Enter Email" name="uname" required>
    <br>
      <b>CoOrganizer Email</b>
      <br>
      <input type="text" placeholder="Enter Email" name="uname" required>
    </label>
    <br>
    <button type="submit">Finish</button>
</form> 


</body>
</html>