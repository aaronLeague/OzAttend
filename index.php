
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

#myInput {
  background-image: url('/css/searchicon.png');
  background-position: 10px 12px;
  background-repeat: no-repeat;
  width: 100%;
  font-size: 16px;
  padding: 12px 20px 12px 40px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
}
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


#myUL {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

#myUL li a {
  border: 1px solid #ddd;
  margin-top: -1px; /* Prevent double borders */
  background-color: #f6f6f6;
  padding: 12px;
  text-decoration: none;
  font-size: 18px;
  color: black;
  display: block
}

#myUL li a:hover:not(.header) {
  background-color: #eee;
}
</style>
</head>
<body>
  <a href="login.php">
<button style="width: auto; float: right; type="submit">Sign Out </button>
</a>
<h2>Event list</h2>

<input type="text" id="myInput" onkeyup="myFunction1()" placeholder="Search for names.." title="Type in a name">

<ul id="myUL">
  <li><a href="page6.html">Event 1</a></li>
  <li><a href="page6.html">Event 2</a></li>

  <li><a href="page6.html">Event 3</a></li>
  <li><a href="page6.html">Event 4</a></li>

  <li><a href="page6.html">Event 5</a></li>
  <li><a href="page6.html">Event 6</a></li>
  <li><a href="page6.html">Event 7</a></li>
</ul>
<br>

<a href="page4.html">
   <button style="width:auto; type="submit">Create Event</button>
   </a>
<script>
function myFunction2() {
  document.getElementById("").style.color = "red";
}
function myFunction1() {
    var input, filter, ul, li, a, i, txtValue;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    ul = document.getElementById("myUL");
    li = ul.getElementsByTagName("li");
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        txtValue = a.textContent || a.innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";
        }
    }
}
</script>

</body>
</html>
