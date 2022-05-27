Class MainActivity:

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarHorizontal;
    private ProgressBar progressBarCircular;
    private int progresso = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        progressBarCircular = findViewById(R.id.progressBarCircular);

        //Remover ProgressBar Circular no code
        progressBarCircular.setVisibility( View.GONE );

    }

    public void carregarProgressbar(View view){

        //ProgressoBar horizontal
        this.progresso = this.progresso + 1;
        progressBarHorizontal.setProgress( this.progresso );

        //Progresso Circular
        progressBarCircular.setVisibility( View.VISIBLE );

        if( this.progresso == 10 ){
            progressBarCircular.setVisibility( View.GONE );
        }
    }
}
