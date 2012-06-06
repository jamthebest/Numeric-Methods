require './Interpolacion'
require './Factorizacion'
class Trazador
	def opc
		puts "---------MENU---------"
		puts "1. Trazador Lineal"
		puts "2. Trazador Cuadratico"
		puts "3. Trazador Cubico"
		puts "4. Salir"
		print "Seleccione su opcion: "
		gets.chomp
	end
	
	def menu
		op = opc.to_i
		puts ""
		while !((1..4).include? op)
			puts "Opcion Incorrecta!"
			op = opc.to_i
			puts ""
		end
		op
	end
	
	def cuadratica
		puts "Metodo no implementado"
	end
	
	def cubica
		ret = []
		b = []
		fac = Factorizacion.new
		x = []
		for i in 1..((@x.size/2)-2)
			ret[i-1] = []
			for j in 0..((@x.size/2)-3)
				ret[i-1][j] = 0
			end
			ret[i-1][i-2] = (i != 1) ? (@x[i*2].to_f - @x[(i-1)*2].to_f) : 0
			ret[i-1][i-1] = 2*(@x[(i+1)*2].to_f - @x[(i-1)*2].to_f)
			ret[i-1][((i) > (@x.size/2)-3) ? 1-(i+1) : i] =(i!=(@x.size/2)-2) ? @x[(i+1)*2].to_f - @x[i*2].to_f : 0
			p1 = (6/(@x[(i+1)*2].to_f - @x[i*2].to_f))*(@x[(i+1)*2 + 1].to_f - @x[(i*2)+1].to_f)
			p2 = (6/(@x[i*2].to_f - @x[(i-1)*2].to_f))*(@x[(i-1)*2 + 1].to_f - @x[(i*2)+1].to_f)
			b[i-1] = (p1.round 4) + (p2.round 4)
		end
		f = fac.lu(ret, b)
		for i in 1..((@x.size/2)-1)
			comun = (@x[i*2].to_f - @x[(i-1)*2].to_f)
			t1 = (i-1 != 0) ? ((f[i-2]/(6*comun)).round 4) : 0
			t2 = (i < @x.size/2 -1) ? ((f[i-1]/(6*comun)).round 4) : 0
			t3 = (@x[(i-1)*2 + 1].to_f/comun).round 4
			t4 = (i-1 != 0) ? (((f[i-2]*comun)/6).round 4) : 0
			t5 = (@x[(i*2)+1].to_f/comun).round 4
			t6 = (i < @x.size/2 -1) ? (((f[i-1]*comun)/6).round 4) : 0
			s1 =(t1!=0) ? "#{t1}(#{@x[i*2]}-x)^3 #{t2>=0 ? "+ " : "- "}" : "#{t2<0 ? "-" : ""}"
			s2 = t2!=0 ? "#{t2.abs}(x#{@x[(i-1)*2].to_f<0 ? "+" : "-"}#{@x[(i-1)*2]})^3 #{t3-t4 < 0 ? "-" : "+"} " : ""
			s3 = "#{(t3-t4).abs.round 4}(#{@x[i*2]}-x) #{t5-t6 < 0 ? "-" : "+"} "
			s4 = "#{(t5-t6).abs.round 4}(x#{@x[(i-1)*2].to_f < 0 ? "+" : "-"}#{@x[(i-1)*2]})"
			x[i-1] = s1 + s2 + s3 + s4
		end
		x
	end
	
	def run
		op = menu
		while (op != 4)
			f = ""
			ret = ""
			@int = Interpolacion.new
			@x =  if op != 2
							@int.run
						end
			case op
				when 1
					ret = lineal
			
				when 2
					ret = cuadratica
					
				when 3
					ret = cubica
			end
			mitad = ((ret.size/2) - ((ret.size.odd?) ? 0 : 1)) if op != 2
			for i in 0..(op != 2 ? (ret.size-1) : -1)
				f += ((mitad==i ? "F(x) = " : "#{" "*7}") + "| #{ret[i]},  #{@x[i*2]} <= x <= #{@x[(i+1)*2]}\n")
			end
			@int.escribir(f) if op != 2
			op = menu
		end
	end
	
	def lineal
		ret = []
		for i in 1..((@x.size/2)-1)
			nu = @x[i*2].to_f
			co = (@x[(i*2)+1].to_f - @x[((i-1)*2)+1].to_f)/(nu - @x[(i-1)*2].to_f)
			op = co >= 0 ? "+" : "-"
			ret[i-1] = "#{@x[(i*2)+1]}#{op}#{co.abs.round 4}(x#{nu<=0 ?"+":"-"}#{nu.abs.to_s})"
		end
		ret
	end
end
