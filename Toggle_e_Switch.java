Class MainActivity:


public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textResultado;
    private CheckBox checkSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        checkSenha = findViewById(R.id.checkSenha);
        textResultado = findViewById(R.id.textResultado);

        adicionarListener();
    }
    
    public void adicionarListener(){

        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if( switchSenha.isChecked() ){
                    textResultado.setText("ligado");
                }else {
                    textResultado.setText("desligado");
                }
            }
        });
    }
    
    public void enviar(View view){

        if( toggleSenha.isChecked() ){
            textResultado.setText("Toogle ligado");
        }else {
            textResultado.setText("Toogle desligado");
        }
    }
    
