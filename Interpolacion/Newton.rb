require './Interpolacion'
class Newton
	def men
		puts "Desea salir de la aplicacion? si/no"
		gets.chomp.downcase
	end
	
	def run
		op = ""
		@int = Interpolacion.new
		while !op.eql?("si") && !op.eql?("s")
			@x = @int.run
			generar
			i = 0; ret = ""
			while i < (@x.size) do
				a = ""; nu = 0.0
				for j in 0..(i/2)
					a += "x#{j},"
				end
				nu = (i != 0) ? rec(a[0..(a.size-2)]).to_f : @x[1].to_f
				op = 	nu >= 0 ? " + " : " - "
				nu = nu.abs if i != 0
				ret += op
				ret += "#{nu}"
				for j in 0..((i/2) - 1)
					op = 	@x[j*2].to_f <= 0 ? "+" : "-"
					nu = @x[j*2].to_f.abs
					ret += "(x#{op}#{nu})"
				end
				i += 2
			end
			ret = ret[3..(ret.size-1)]
			@int.escribir(ret)
			op = men
		end
	end
	
	def generar
		@val = {}; i = 0
		while i < ((@x.size/2)-1) do 
			@val["x#{i},x#{i+1}"] = ((@x[(i*2)+3].to_f - @x[(i*2)+1].to_f)/(@x[(i*2)+2].to_f - @x[i*2].to_f)).round 4
			i += 1
		end
	end
	
	def rec(v)
		if v.size == 5
			@val[v]
		else
			(((rec(v[3..(v.size-1)])).to_f - (rec(v[0..(v.size-4)])).to_f)/(((@x[v[v.size-1].to_i*2]).to_f - (@x[v[1].to_i*2]).to_f))).round 4
		end
	end
end
