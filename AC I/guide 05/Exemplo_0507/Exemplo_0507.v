// -------------------------
// Exemplo_0507 - GATES
// Nome: Matheus Santos Rosa Carneiro
// Matricula: 613414
// -------------------------

module Exemplo_0507();

//-------------------- definir dados
reg a;
reg b;
wire a_neg, b_neg, c, d, s; 

//----------------------- definir 5 instancias para nand
nor U1( a_neg, a, a );
nor U2( b_neg, b, b );
nor U3( c, a_neg, b );
nor U4( d, b_neg, a );
nor U5( s, c, d  );

//---------------------- parte principal
initial 
begin : main 
   $display("Exemplo_0507 - Matheus Santos Rosa Carneiro - 613414");
   $display("Test module 507");
   // projetar testes no modulo
   $monitor("a = %4b b = %4b s = %4b", a, b, s); 

   a = 1'b0; b = 1'b0;
#1 a = 1'b0; b = 1'b1;
#1 a = 1'b1; b = 1'b0;
#1 a = 1'b1; b = 1'b1;

end

endmodule // Exemplo_0507()  
