<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<div class="container">
    <h1>User Login</h1>

    <form action="login" method="post">
        <input type="email" name="email" placeholder="Enter Email" required>

        <input type="password" name="password" placeholder="Enter Password" required>

        <button type="submit">Login</button>
    </form>

    <p>New user? <a href="register.jsp">Register Here</a></p>
</div>

</body>
</html>