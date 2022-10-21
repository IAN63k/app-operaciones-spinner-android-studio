# app-operaciones-spinner-android-studio
### Aplicación implementando spinner para la opción de la operación (Suma, resta, exponente, radicación) a realizar.
#### _Distribución de los elementos_
  En primera instancia se creó el diseño de la app para realizar las operaciones. 
  Los elementos usados fueron, TextView,  EditText de tipo Number, Button y spinner para la seleccion de la operación a realizar.
  
![Screenshot 2022-10-21 153432](https://user-images.githubusercontent.com/81268917/197284123-6b72ea5a-19ec-4a58-99a6-170282255889.jpg)

  Para estos elementos se creó esta disposición de entrada, con un color de fondo oscuro y dos campos de texto para el ingreso de los datos “A” y “B”:
  
![Screenshot 2022-10-21 154351](https://user-images.githubusercontent.com/81268917/197285483-4991379b-d90e-4fca-be7b-afd9bc9852ab.jpg)

#### _Método de operación_

 En la Clase principal, la MainActivity es la encargada de establecer la conexión lógica del programa, en este caso de declarar -
 las variables por referencia hacia los elementos de la activity, y de esta forma establecer las operaciones para cada una de las opciones del spinner.

 Por medio del metodo de _operation_ se realizarán las operaciones de suma, resta, exponente y radicación entre los datos A y B y su resultado se visualizará 
 en el TextView con el id txtV.
 
 Una vez finalizado el código, se le establece el atributo para el evento de onclick en el botón, con el fin de realizar el llamado el método _“operation”_.


#[**APK del proyecto**]: https://github.com/IAN63k/app-operaciones-spinner-android-studio/blob/main/app-debug.apk
