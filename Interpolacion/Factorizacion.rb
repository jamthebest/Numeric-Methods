require 'matrix'
class Factorizacion
	def run
		ar = leer
		return nil if ar == nil
		re = b(ar.size)
		ma = to_matriz(ar)
		lu(ma, re)
	end
	
	def lu(ma, b)
		l = []
		u = []
		for i in 0..(ma.size-1)
			l[i] = []
			u[i] = []
		end
		for i in 0..(ma.size-1)
			for j in 0..(ma.size-1)
				sum = 0.0
				for k in 0..(i-1)
					sum += (l[i][k])*(u[k][j])
				end
				u[i][j] = i <= j ? ((ma[i][j] - sum).round 4) : 0.0
			end
			for j in 0..(ma.size-1)
				sum = 0.0
				for k in 0..(i-1)
					sum += (l[j][k])*(u[k][i])
				end
				l[j][i] = i <= j ? (((1/u[i][i])*(ma[j][i] - sum)).round 4) : 0.0
			end
		end
		puts "l = #{l}u = #{u}\n"
		y = []
		for i in 0..(ma.size-1)
			y[i] = 0.0
			for j in 0..(i-1)
				y[i] -= (l[i][j])*(y[j])
			end
			y[i] += b[i]
			y[i] = y[i].round 4
		end
		x = []
		for i in (ma.size-1).downto(0)
			x[i] = 0.0
			for j in (i+1)..(ma.size-1)
				x[i] -= (u[i][j])*(x[j])
			end
			x[i] += y[i]
			x[i] = (x[i]/u[i][i]).round 4
		end
		x
	end
	
	def leer
		puts "Ingrese los elemento y al final el arreglo de resultados"
		ar = []
		num = ""
		puts "ingrese el siguiente elemento o fin para terminar"
		num = gets.chomp
		i = 0
		while (!num.eql?("fin"))
			ar[i] = num.to_f
			puts "ingrese el siguiente elemento o fin para terminar"
			num = gets.chomp
			i += 1
		end
		if Math.sqrt(ar.size) != Math.sqrt(ar.size).round
			return nil
		end
		ar
	end
	
	def b(tam)
		ar = []
		for i in 0..(Math.sqrt(tam-1))
			puts "ingrese el siguiente elemento de b"
			num = gets.chomp
			ar[i] = num.to_f
			i += 1
		end
		ar
	end
	
	def to_matriz(ar)
		ma = []
		for i in 0..(Math.sqrt(ar.size)-1)
			ma[i] = []
		end
		i = 0
		j = 0
		for con in 0..(ar.size - 1)
			if con != 0 && con%(Math.sqrt(ar.size).to_i) == 0
				j = 0
				i += 1
			end
			ma[i][j] = ar[con].to_f.round 4
			j += 1
		end
		ma
	end
end
