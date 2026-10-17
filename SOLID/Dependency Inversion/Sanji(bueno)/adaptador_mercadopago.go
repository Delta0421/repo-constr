package main

import "fmt"

type AdaptradorMercadoPago struct {
	TokenAccest string
}

func (mp *AdaptradorMercadoPago) Cobrar(monto float64) error {
	fmt.Printf("[Merocado Pago] Cobro realizado por el monto de %.2f con el token %s\n", monto, mp.TokenAccest)
	return nil
}
