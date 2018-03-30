//-------------------------------------
// Guia 07 - Exemplo_06     	      |
// Nome: Matheus Santos Rosa Carneiro |
// Matricula: 613414		      |
//-------------------------------------

module tabela ( output a,
		input  x,
		input  y,
		input  w,
		input  z);

//descrever por expressao
assign a = ((x&y&~w) & (~x|~y|w)) | ((~y|~w|~z) & x);

endmodule //tabela

module simplificado ( output a,
		      input  x,
		      input  y,
		      input  w,
		      input  z);
			

//descrever por expressao
assign a = (~y|~w|~z) & x;

endmodule //simplificado

module Exemplo_05;

//--------------------- definir dados
reg x;
reg y;
reg w;
reg z;

wire a;
wire a2;

tabela moduloTable(a, x, y, w, z);
simplificado moduloSimple(a2, x, y, w, z);

//-------------------- parte principal
initial 
   begin : main
   $display("Exemplo_06 - Matheus Santos Rosa Carneiro - 613414");
    $display("Test module Mapa Veitch-Karnaugh");
    $display("X Y W Z =  A  A2");

    //projetar testes no modulo
    $monitor("%b %b %b %b = %2b %2b ", x, y, w, z, a, a2);
          x=0; y=0; w=0; z=0;
      #1  x=0; y=0; w=0; z=1;
      #1  x=0; y=0; w=1; z=0;
      #1  x=0; y=0; w=1; z=1;
      #1  x=0; y=1; w=0; z=0;
      #1  x=0; y=1; w=0; z=1;
      #1  x=0; y=1; w=1; z=0;
      #1  x=0; y=1; w=1; z=1;
      #1  x=1; y=0; w=0; z=0;
      #1  x=1; y=0; w=0; z=1;
      #1  x=1; y=0; w=1; z=0;
      #1  x=1; y=0; w=1; z=1;
      #1  x=1; y=1; w=0; z=0;
      #1  x=1; y=1; w=0; z=1;
      #1  x=1; y=1; w=1; z=0;
      #1  x=1; y=1; w=1; z=1;

    end

endmodule //Exemplo_06
