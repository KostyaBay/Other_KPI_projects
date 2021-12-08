from scipy.optimize import linprog

z = [2, -1, 3, -2, 1]
lhs_ineq = [[-1, 1, 1, 0, 0], [1, -1, 0 , 1, 0], [1, 1, 0, 0, 1]]
rhs_ineq = [1, 1, 2]

opt = linprog(c = z, A_eq = lhs_ineq, b_eq = rhs_ineq,
method = "revised simplex")
print(opt)
