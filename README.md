<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/hajidito/springboot-crud-rentalmobil"></a>

  <h3 align="center">Simple CRUD REST API using Spring Boot</h3>

  <p align="center">
    <a href="https://spring-crud-rentalmobil.herokuapp.com/rentalmobil/mobil">Check out Deployed App </a>
  </p>
</p>

<!-- ABOUT THE PROJECT -->
## About The Project

Features:
* Create
* Read
* Update
* Delete

### Built With
* [Spring Boot](https://spring.io/projects/spring-boot)


<!-- GETTING STARTED -->
## Getting Started

### Read All Car

* Url : /rentalmobil/mobil
* Method : GET


### Read Car By Id

* Url : /rentalmobil/mobil/{carId}
* Method : GET

### Read Car By Name

* Url : /rentalmobil/carimobil?name={carName}
* Method : GET

### Read Car By Tenant Name

* Url : /rentalmobil/caripenyewa?name={tenantName}
* Method : GET

### Create Car

* Url : /rentalmobil/mobil
* Method : POST
* Body :

```json
{
    "name": "jazz",
    "brand": "honda",
    "licensePlateNumber": "p 4 k",
    "certificateVehicleNumber": "0155311",
    "priceDay": 200000
}
```

### Update Car

* Url : /rentalmobil/mobil/{carId}
* Method : PUT
* Body :
```json
{
    "name": "jazz",
    "brand": "honda",
    "licensePlateNumber": "p 4 k",
    "certificateVehicleNumber": "0155311",
    "priceDay": 200000,
    "tenantName": "dito",
    "tenantIdentityNumber": "03090090005",
    "longTimeRent": 3
}
```

### Delete Car

* Url : /rentalmobil/mobil/{carId}
* Method : DELETE


<!-- CONTACT -->
## Contributors

* Haji Dito M. A. - [Github](https://github.com/hajidito) - hajidito.kerja@gmail.com


