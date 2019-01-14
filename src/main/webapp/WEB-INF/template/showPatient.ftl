<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Info Patient</title>
</head>
<body>
<h1>Patient InFo</h1>
<table>
    <tr>
        <td>Id</td>
        <td>${patient.id}</td>
    </tr>
    <tr>
        <td>First name</td>
        <td>${patient.firstName}</td>
    </tr>
    <tr>
        <td>Last name</td>
        <td>${patient.lastName}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${patient.age}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${patient.email}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${patient.address}</td>
    </tr>
    <tr>
        <td>dateOfVisit</td>
        <td>${patient.dateOfVisit}</td>
    </tr>
    <tr>
        <td>Illness</td>
        <td>${patient.illness}</td>
    </tr>
</table>
<br>
<a href="/patients">Back</a>
</body>
</html>