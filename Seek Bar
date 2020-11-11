Class MainActivity:

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarEscala;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarEscala = findViewById(R.id.seekBarEscala);
        textResultado = findViewById(R.id.textResultado);

        seekBarEscala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           
               //Opção quando arrasta a bolinha pelo SeekBar
           @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //textResultado.setText("onProgressChanged");
                textResultado.setText("Progresso: " + progress + "/" + seekBar.getMax());
            }
              //Opção quando é clicado na bolinha do SeekBar
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //textResultado.setText("onStartTrackingTouch");
            }
               //Opção quando solta a bolinha do SeekBar
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //textResultado.setText("onStopTrackingTouch");
            }
        });
    }

    public void recuperarProgresso(View view){
        //Resultado escolhido
        textResultado.setText("Escolhido: " + seekBarEscala.getProgress());

    }

}
