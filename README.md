# web3j quorum Spring Boot Starter

Integrate web3j quorum into your Spring Boot applications via Spring's dependency injection.


## Getting started

A sample application is available [here](https://github.com/web3j/examples/tree/master/spring-boot)

To use, create a new [Spring Boot Application](https://spring.io/guides/gs/spring-boot/), and 
include the following dependencies:

Maven:

```xml
<dependency>
    <groupId>org.web3j</groupId>
    <artifactId>web3j-quorum-spring-boot-starter</artifactId>
    <version>1.2.0</version>
</dependency>
```

Gradle:

```groovy
compile ('org.web3j:web3j-quorum-spring-boot-starter:1.2.0')
```

Now Spring can inject web3j quorum instances for you where ever you need them:

```java
@Autowired
private Web3j web3j;
```

No additional configuration is required if you want to connect via HTTP to the default URL 
http://localhost:8545.

Otherwise simply add the address of the endpoint in your application properties:

```properties
# An infura endpoint
web3j.quorum.client-address = https://morden.infura.io/

# Or, an IPC endpoing
web3j.quorum.client-address = /path/to/file.ipc
```


## Admin clients

If you wish to make use of the 
[Parity](https://github.com/ethcore/parity/wiki/JSONRPC-personal-module) or 
[Geth](https://github.com/ethereum/go-ethereum/wiki/Management-APIs#personal) personal modules 
to manage accounts, enable the admin client:

```properties
web3j.quorum.admin-client = true
```

Then Spring can inject admin clients:

 ```java
 @Autowired
 private Parity parity;
 ```

**Note**: This is not required for transacting with web3j quorum.  


## Further information

For further information on web3j quorum, please refer to the [web3j home page](https://web3j.io).
