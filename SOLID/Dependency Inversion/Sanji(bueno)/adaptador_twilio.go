package main

import "fmt"

type AdaptradorTwilio struct {
	IdentificadorCuenta string
}

func (at *AdaptradorTwilio) Enviar(correo string, monto float64) error {
	fmt.Printf("[Twilio] Comprobante enviado al correo %s, por el monto de %.2f (Cuenta: %s)\n", correo, monto, at.IdentificadorCuenta)
	return nil
}
