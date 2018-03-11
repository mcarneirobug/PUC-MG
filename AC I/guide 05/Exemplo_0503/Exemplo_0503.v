// -------------------------
// Exemplo_0503 - GATES
// Nome: Matheus Santos Rosa Carneiro
// Matricula: 613414
// -------------------------


module Exemplo_0503();

//-------------------- definir dados 
reg a;
reg b;

wire w, z, s;

//--------------------- definir quatro instancias nor 

nor U1 (w, a);
nor U2 (z, b);
nor U3 (s, w, z);
nor U4 (s, z, w);

//--------------------- parte principal 

initial 
begin : main 
   $display("Exemplo_0503 - Matheus Santos Rosa Carneiro - 613414");
   $display("Test module 503");
   // projetar testes do modulo
   $monitor("a = %4b b = %4b s = %4b", a, b, s); 

   a = 1'b0; b = 1'b0;

#1 a = 1'b0; b = 1'b1;
#1 a = 1'b1; b = 1'b0;
#1 a = 1'b1; b = 1'b1;

end

endmodule // Exemplo_0503()  


