<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Patients</title>
</head>
<body>
<h1>Patients</h1>
<table>
    <tr>
        <th>Id</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Age</th>
        <th>Email</th>
        <th>Address</th>
        <th>dateOfVisit</th>
        <th>illness</th>
    </tr>
    <#list patients as patient>
        <tr>
            <td><a href="/patient/${patient.id}">${patient.id}</a></td>
            <td>${patient.firstName}</td>
            <td>${patient.lastName}</td>
            <td>${patient.age}</td>
            <td>${patient.email}</td>
            <td>${patient.address}</td>
            <td>${patient.dateOfVisit}</td>
            <td>${patient.illness}</td>
        </tr>
    </#list>
</table>
</body>
</html>