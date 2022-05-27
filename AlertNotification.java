Class MainActivity:


public  void notificacao(View view){

        //ImageView imagem = new ImageView( getApplicationContext() );
        //imagem.setImageResource( android.R.drawable.star_big_off );
          
        // Exemplo 1
        
        TextView textView = new TextView( getApplicationContext() );
        textView.setBackgroundResource(R.color.design_default_color_on_primary);
        textView.setText("Ação realizada com sucesso!");

        Toast toast = new Toast( getApplicationContext() );
        toast.setDuration( Toast.LENGTH_LONG );
        toast.setView( textView );
        toast.show();
        
        
        // Exemplo 2
        
        /*
        Toast.makeText(
                getApplicationContext(),
                "Ação realizada com sucesso!",
                Toast.LENGTH_SHORT
        ).show();
         */
    }
