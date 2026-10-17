package main

import "fmt"

func main() {
	fmt.Println("===== Entorno Real =====")

	pasarelaReal := &AdaptradorMercadoPago{TokenAccest: "12345!\"#$%"}
	emisorReal := &AdaptradorTwilio{IdentificadorCuenta: "54321%$#"}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	_ = servicioReal.ProcesarPago("changotremendo@gmail.com", 1500.01)

	fmt.Println("===== Entorno Prueba =====")

	pasarelaMock := &SimuladorPasarela{DebeFallar: true}
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	if err := servicioMock.ProcesarPago("tilintravieso@gmail.com", 3000); err != nil {
		fmt.Println("Resultado de la prueba: ", err)
	}

}
