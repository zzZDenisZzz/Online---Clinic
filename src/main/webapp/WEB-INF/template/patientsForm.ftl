<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Patient's Form</title>
    <link href="style/css/form.css" rel="stylesheet"/>
</head>
<body>
<form name="patient" action="/addPatient" method="post">
    <div class="main">
        <div class="field">
            <label for="fname">First name</label>
            <input type="text" id="fname" name="firstName"/>
        </div>
        <div class="field">
            <label for="lname">Last name</label>
            <input type="text" id="lname" name="lastName"/>
        </div>
        <div class="field">
            <label for="age">Age</label>
            <input type="text" id="age" name="age"/>
        </div>
        <div class="field">
            <label for="em">Email</label>
            <input type="text" id="em" name="email"/>
        </div>
        <div class="field">
            <label for="address">Address</label>
            <input type="text" id="address" name="address"/>
        </div>
        <div class="field">
            <label for="date">Date of Visit</label>
            <input type="text" id="date" name="dateOfVisit"/>
        </div>
        <div class="field">
            <label for="ill">Illness</label>
            <input type="text" id="ill" name="illness"/>
        </div>
        <div class="field">
            <input type="submit" value="Submit"/>
        </div>
    </div>
</form>
</body>
</html>