import express from 'express'
import morgan from 'morgan'
import { eurekaClient } from './eurekaclient.config.js'

const app = express()
app.use(morgan('dev'))

app.get('/api/notificaciones',(req,res)=>{
    res.status(200).json({notifaciones: ['noti1','noti2','noti3']})
})

const PORT = 8088
app.listen(PORT,()=>{
    console.log(`Server rodando en puerto ${PORT}`)

    eurekaClient.start((error) => {
        if (error) {
          console.log('Error al registrar el servicio en Eureka:', error);
        } else {
          console.log('Servicio registrado en Eureka correctamente');
        }
      })
})

process.on('SIGINT', () => {
    eurekaClient.stop();
    process.exit();
  });