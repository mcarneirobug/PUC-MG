//------------------------------------
// Exemplo_0601 - GATES  	     |
// Nome: Matheus Santos Rosa Carneiro|
// Matricula: 613414                 |
//------------------------------------

//--------------------
// or_gate	     |
//--------------------

module or_gate( output s, 
                input  a,
                input  b);

//descrever por portas
or U1(s, a, b);

endmodule //or_gate

//--------------------
// and_gate	     |
//--------------------

module and_gate( output s, 
		 input  a,
		 input  b);


//descrever por portas
and U1(s, a, b);

endmodule //and_gate


module test_Exemplo601;
//---------------------- definir dados
reg x;
reg y;
wire w;
wire z;

//---------------------- chamada module
 
and_gate moduloAnd(w, x, y);
or_gate  moduloOr(z, x, y);
//---------------------- parte principal 
initial 
begin : main 
    $display("Exemplo_0601 - Matheus Santos Rosa Carneiro - 613414");
    $display("Test Lu's module");
    $display("   x    y    w    z ");
    $monitor("%4b %4b %4b %4b", x, y, w, z);

    //projetar testes do modulo
    x = 1'b0; y = 1'b0;
#1  x = 1'b0; y = 1'b1;
#1  x = 1'b1; y = 1'b0;
#1  x = 1'b1; y = 1'b1;

    end 
endmodule//test_Exemplo601  
