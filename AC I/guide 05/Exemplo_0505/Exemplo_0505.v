// -------------------------
// Exemplo_0505 - GATES
// Nome: Matheus Santos Rosa Carneiro
// Matricula: 613414
// -------------------------

module Exemplo_0505();

//------------------------ definir dados
reg a;
reg b;

wire w, s;

//------------------------ definir duas instancias para nor

nor U1 (w, a, b);
nor U2 (s, w, w);

//------------------------- parte principal

initial 
begin : main 
    $display("Exemplo_0505 - Matheus Santos Rosa Carneiro - 613414");
    $display("Test module 505");
    // projetar testes do modulo
    $monitor("a = %4b b = %4b s = %4b", a, b, s);

    a = 1'b0; b = 1'b0;

#1  a = 1'b0; b = 1'b1; 
#1  a = 1'b1; b = 1'b0;
#1  a = 1'b1; b = 1'b1;

end

endmodule // nor_from_or()   
