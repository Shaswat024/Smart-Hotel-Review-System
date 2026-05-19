<!DOCTYPE html>
<html>
<head>
    <title>Add Review</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<div class="container">
    <h1>Add Hotel Review</h1>

    <form action="review" method="post">
        <input type="text" name="hotelName" placeholder="Hotel Name" required>

        <input type="number" name="rating" placeholder="Rating (1-5)" min="1" max="5" required>

        <textarea name="review" placeholder="Write your review here..." rows="5" required></textarea>

        <button type="submit">Submit Review</button>
    </form>

    <p><a href="dashboard.jsp">Back to Dashboard</a></p>
</div>

</body>
</html>