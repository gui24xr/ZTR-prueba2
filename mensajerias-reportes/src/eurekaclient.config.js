import { Eureka } from "eureka-js-client";

export const eurekaClient = new Eureka({
    instance:{
        app: 'notificaciones-microservice',
        hostName: 'localhost',
        ipAddr: '127.0.0.1',
        port:{
            '$': 8088, 
            '@enabled': true,
        },
        vipAddress: 'notificaciones-microservice',
        dataCenterInfo: {
            '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
            name: 'MyOwn', // Nombre del data center
          }
    },
    eureka:{
        host: 'localhost',
        port: 8761,
        servicePath: '/eureka/apps/'
    }
})
