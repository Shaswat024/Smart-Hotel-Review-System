<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<div class="container">
    <h1>User Registration</h1>

    <form action="register" method="post">
        <input type="text" name="name" placeholder="Enter Name" required>

        <input type="email" name="email" placeholder="Enter Email" required>

        <input type="password" name="password" placeholder="Enter Password" required>

        <button type="submit">Register</button>
    </form>

    <p>Already have an account? <a href="login.jsp">Login</a></p>
</div>

</body>
</html>