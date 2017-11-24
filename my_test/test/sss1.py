def median(lst):
    lst = sorted(lst)
    n = len(lst)
    if n < 1:
            return None
    if n % 2 == 1:
            return lst[n//2]
    else:
            return sum(lst[n//2-1:n//2+1])/2.0

grades = [100, 100, 90, 40, 80, 100, 85, 70, 90, 65, 90, 85, 50.5]

def print_grades(grades):
    for grade in grades:
        print ("Grades:", grade,)


print_grades(grades)


def find_short(s):
    # your code here
    a = s.split(' ')

    return min(len(i)for i in a)
print(find_short("bitcoin take over the world maybe who knows perhaps"))

def longest_consec(strarr, k):
    # your code
    n = len(strarr)

    if n == 0 or k > n or k <= 0 :
        return ""

    else: return (max(len(k)) for k in strarr)

    # code here
