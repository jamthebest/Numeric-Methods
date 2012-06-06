class Interpolacion
  
  def is_num?(x)
    (x.downcase.match /([a-z]+)/) == nil
  end
  
  def escribir(res)
  	puts "Ingrese el nombre del archivo a guardar"
  	ar = gets.chomp
  	File::open( "#{Dir.pwd}/#{ar}.txt", "w" ) do |f|
			f << res
		end
		puts "Guardado en #{Dir.pwd}/#{ar}.txt"
  end
  
  def menu
    val = ""
    while (!val.eql?("si") && !val.eql?("no")) do
      puts "Desea continuar ingresando valores? si/no\n"
      val = gets.chomp.downcase
    end
    val.eql?("si")
  end
  
  def leer(i, tipo)
    if tipo.eql?("x")
      print "Ingrese X#{i}: "
    else
      print "Ingrese F(X#{i}): "
    end
    gets.chomp
  end
  
  def ordenar(x)
  	i = 0
  	while(i < (x.size)-3) do
  		j = i + 2
  		while(j < (x.size)-1) do
  			if x[i].to_f > x[j].to_f
  				temp = x[i]
  				temp2 = x[i+1]
  				x[i] = x[j]
  				x[i+1] = x[j+1]
  				x[j] = temp
  				x[j+1] = temp2
  			end
  			j += 2
  		end
  		i += 2
  	end
  	x
  end
  
  def validar(x, i, tipo)
    num = x.downcase
    while (!(is_num?(num))) do
      puts "Valor incorrecto!!!"
      num = leer(i, tipo)
    end
    num
  end
  
  def run
    i = 0; n = ""
    x = []
    while i == 0 || menu do
      xn = leer(i, "x")
      n = validar(xn, i, "x")
      fx = leer(i, "fx")
      f = validar(fx, i, "fx")
      x.push n
      x.push f
      i += 1
    end
    ordenar(x)
  end
end
