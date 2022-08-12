public static void main(String[] arg) {
        int numeroif = 11;
        if (numeroif > 0) {
            System.out.println("El numero es Positivo");
        } else if (numeroif < 0) {
            System.out.println("El numero es Negativo");
        } else {
            System.out.println("El numero es 0");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(numeroWhile);
            numeroWhile ++;
        }while (numeroWhile < 0);
        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }
        String estacion = "Verano";
        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una Estacion del Año");
        }
    }
