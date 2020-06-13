#Car RestFull
Car RESTfull service with spring boot and maven.

GET tüm arabalar için. http://localhost:8080/api/cars/

GET key ile sorgu  için. http://localhost:8080/api/cars/searchKey/{key}

GET tüm arabalar için. http://localhost:8080/api/cars/searchCriteria/{criter}

Servis Postman kullanılarak test edilmiştir.Eclipse IDE'si kullanılarak çalıştırılmıştır.Spring boot olduğu için herhangi bir server kullanmadan(Tomcat vs.) otomatik olarak çalıştırılmıştır. 
Sistemin mimarisi aşağıdaki gibidir.

![1](https://user-images.githubusercontent.com/23105887/84574107-2b8f9900-adad-11ea-9210-dc9963ccc9d9.PNG)
![2](https://user-images.githubusercontent.com/23105887/84574108-2c282f80-adad-11ea-8d25-20a3d03a5396.PNG)
![3](https://user-images.githubusercontent.com/23105887/84574109-2cc0c600-adad-11ea-8bf0-bccca752825d.PNG)

