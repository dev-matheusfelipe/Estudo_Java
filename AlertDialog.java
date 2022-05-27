Class MainActivity:

public void abrirDialog(View view){

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder( this );

        //Configurar titulo e mensagem
        dialog.setTitle("Titulo da dialog");
        dialog.setMessage("Mensagem da dialog");

        //Configurar cancelamento
        dialog.setCancelable(false);

        //Configurar icone
        dialog.setIcon( android.R.drawable.ic_btn_speak_now );

        //Configura acoes para sim e nao
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão sim",
                        Toast.LENGTH_LONG
                ).show();

            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                /*Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão não",
                        Toast.LENGTH_LONG
                ).show();*/
            }
        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }
