def solution(s):
    
    if(len(s) == 1):
        return 1
    
    len_list = []
    
    count = 1
    for i in range(1, round(len(s))):
        count = 1
        temp_string = ""
        for j in range(0, len(s)):
            if(s[i*j : i*(j+1)] == "" and s[i*(j+1) : i*(j+2)] == ""):
                break

            if(s[i*j : i*(j+1)] == s[i*(j+1) : i*(j+2)]):
                count += 1
            else:
                if(count == 1):
                    temp_string = temp_string + s[i*j : i*(j+1)]
                    count = 1
                else:
                    temp_string = temp_string + str(count) + s[i*j : i*(j+1)]
                    count = 1

        len_list.append(len(temp_string)) 

    return min(len_list)